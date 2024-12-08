import 'dart:io';

void main() {
  List<int> numbers = [1, 2, 2, 3, 3, 3, 4, 5, 5, 6];

  Map<int, int> occurrences = {};

  for (var number in numbers) {
    if (occurrences.containsKey(number)) {
      occurrences[number] = occurrences[number]! + 1;
    } else {
      occurrences[number] = 1;
    }
  }

  print("Numbers that occur exactly once:");
  occurrences.forEach((key, value) {
    if (value == 1) {
      print(key);
    }
  });
}
