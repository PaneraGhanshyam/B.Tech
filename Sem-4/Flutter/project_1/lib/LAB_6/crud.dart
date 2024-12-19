import 'dart:io';

List<Map<String,dynamic>> UserList=[
  {
    "name":"ghanshyam",
    "rollno":503,
    "spi":8.37
  },
  {
    "name":"shyam",
    "rollno":511,
    "spi":8.89
  }
];

void main(){
  while (true) {
    print("\n--- User Management Menu ---");
    print("1. Print All Users");
    print("2. Find User Details by Roll No");
    print("3. Insert User");
    print("4. Update User");
    print("5. Delete User");
    print("6. Search User by Name");
    print("7. Exit");
    stdout.write("Enter your choice: ");
    int? choice = int.tryParse(stdin.readLineSync()!);

    switch (choice) {
      case 1:
        printAllUsers();
        break;

      case 2:
        stdout.write("Enter Roll No to Find: ");
        int? rollno = int.tryParse(stdin.readLineSync()!);
        if (rollno != null) {
          findUserDetails(rollno);
        } else {
          print("Invalid Roll No!");
        }
        break;

      case 3:
        stdout.write("Enter Roll No: ");
        int? rollno = int.tryParse(stdin.readLineSync()!);
        stdout.write("Enter Name: ");
        String? name = stdin.readLineSync();
        stdout.write("Enter SPI: ");
        double? spi = double.tryParse(stdin.readLineSync()!);

        if (rollno != null && name != null && spi != null) {
          insertUser(rollno, name, spi);
          print("User Added Successfully!");
        } else {
          print("Invalid Input!");
        }
        break;

      case 4:
        stdout.write("Enter Roll No to Update: ");
        int? rollno = int.tryParse(stdin.readLineSync()!);
        stdout.write("Enter New Name: ");
        String? name = stdin.readLineSync();
        stdout.write("Enter New SPI: ");
        double? spi = double.tryParse(stdin.readLineSync()!);

        if (rollno != null && name != null && spi != null) {
          updateUser(rollno, name, spi);
          print("User Updated Successfully!");
        } else {
          print("Invalid Input!");
        }
        break;

      case 5:
        stdout.write("Enter Roll No to Delete: ");
        int? rollno = int.tryParse(stdin.readLineSync()!);
        if (rollno != null) {
          deleteUser(rollno);
          print("User Deleted Successfully!");
        } else {
          print("Invalid Roll No!");
        }
        break;

      case 6:
        stdout.write("Enter Name or Part of Name to Search: ");
        String? nameToSearch = stdin.readLineSync();
        if (nameToSearch != null && nameToSearch.isNotEmpty) {
          search(nameToSearch);
        } else {
          print("Invalid Input!");
        }
        break;

      case 7:
        print("Exiting... Goodbye!");
        return;

      default:
        print("Invalid Choice! Please try again.");
    }
  }
}

void printAllUsers(){
  for (var value in UserList) {
    print("Name is ${value["name"]}");
    print("Roll No is ${value["rollno"]}");
    print("Spi is ${value["spi"]}\n");
  }
}

void findUserDetails(dynamic rollno){
  for(var value in UserList){
    if(value["rollno"]==rollno){
      print("Name is ${value["name"]}");
      print("Roll No is ${value["rollno"]}");
      print("Spi is ${value["spi"]}\n");    }
  }
}

void insertUser(dynamic rollno,dynamic name,dynamic spi){
  UserList.add({"name":name,"rollno":rollno,"spi":spi});
}

void updateUser(dynamic rollno,dynamic name,dynamic spi){
  for(var value in UserList){
    if(value["rollno"]==rollno){
      value["name"]=name;
      value["spi"]=spi;
    }
  }
}

void deleteUser(dynamic rollno){
  UserList.removeWhere((user)=>user["rollno"]==rollno);
}

void search(dynamic val){
  for(var value in UserList) {
    if (value["name"].toString().contains(val)) {
      print(value);
    }
  }
}