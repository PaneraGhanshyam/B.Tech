import 'dart:io';

void main(){
  double? p,r,t;

  print("Enter principal amount:");
  p=double.parse(stdin.readLineSync()!);

  print("Enter rate of interest:");
  r=double.parse(stdin.readLineSync()!);

  print("Enter time:");
  t=double.parse(stdin.readLineSync()!);
  
  print('Interest is ${calculateInterest(p, r, t)}');

}
double calculateInterest(double p,double r,double t){
  double interest;
  interest=(p*r*t)/100;

  return interest;
}
