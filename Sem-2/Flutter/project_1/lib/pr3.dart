import 'dart:io';

void main() {
  int? fah;
  double? cel;

  stdout.write("Enter fahrenheit:");
  fah = int.parse(stdin.readLineSync()!);

  cel = (fah - 32) / 1.8;

  stdout.write("Celsius is $cel");
}
