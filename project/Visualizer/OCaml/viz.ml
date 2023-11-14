open Yojson.Basic
open Printf

let () =
  let json = Yojson.Basic.from_file "/home/nikhil/pp-ng25762/project/Client/data/dummy2.json" in

  let open Yojson.Basic.Util in
  let records = json |> to_list in

  try
    match records with
    | [] -> printf "No records found.\n"
    | first_record :: _ ->
      let keys = first_record |> member "Keys" |> to_list |> filter_string in
      printf "%s\n" (String.concat "," keys);
      printf "----------------\n";

      List.iter (fun record ->
        let values = record |> member "Values" |> to_list |> List.map (function
                        | `String s -> s
                        | `Null -> "null"
                        | `Int i -> string_of_int i
                        | (`Assoc _ as obj) -> to_string obj  (* Convert the object to a string *)
                        | unexpected -> failwith ("Unexpected JSON value: " ^ to_string unexpected)
                    ) in

        printf "%s\n" (String.concat "," values);

      ) records
  with 
  | exn -> printf "Exception: %s\n" (Printexc.to_string exn)
