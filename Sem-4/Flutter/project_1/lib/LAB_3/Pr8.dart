import 'dart:io';

void main() {
  String s="this is a test this is a";
  List<String> words = s.split(" ");

  Map<String, int> occurrences = {};

  for (var word in words) {
    if (occurrences.containsKey(word)) {
      occurrences[word] = occurrences[word]! + 1;
    } else {
      occurrences[word] = 1;
    }
  }

  print("Word occurrence of string :  $s");
  occurrences.forEach((key, value) {
      print("$key occure $value times.");
  });
}
