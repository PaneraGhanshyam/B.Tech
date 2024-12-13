class Friend {
  String name;
  int age;
  String email;
  String phone;

  Friend({required this.name, required this.age, required this.email, required this.phone});

  String toString() {
    return 'Name: $name, Age: $age, Email: $email, Phone: $phone';
  }
}

void main() {
  Map<String, Friend> friends = {
    'Alice': Friend(name: 'Alice', age: 25, email: 'alice@example.com', phone: '123-456-7890'),
    'Bob': Friend(name: 'Bob', age: 30, email: 'bob@example.com', phone: '234-567-8901'),
    'Charlie': Friend(name: 'Charlie', age: 22, email: 'charlie@example.com', phone: '345-678-9012'),
  };

  void findFriendByName(String name) {
    if (friends.containsKey(name)) {
      print('Details for $name: ${friends[name]}');
    } else {
      print('Friend with name "$name" not found.');
    }
  }

  findFriendByName('Alice');
  findFriendByName('John');
}
