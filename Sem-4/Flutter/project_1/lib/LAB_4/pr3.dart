import 'dart:io';
int nthFibonacci([int n=10]) {
  if (n <= 1) return n;

  int curr = 0;

  int prev1 = 1;
  int prev2 = 0;

  for (int i = 2; i <= n; i++) {

    curr = prev1 + prev2;

    prev2 = prev1;

    prev1 = curr;
  }

  return curr;
}
void main(){
  print(nthFibonacci());

  print("Enter number:");
  int n=int.parse(stdin.readLineSync()!);

  print(nthFibonacci(n));
}

