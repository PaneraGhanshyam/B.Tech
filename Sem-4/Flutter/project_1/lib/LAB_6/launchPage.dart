import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class LaunchPage extends StatelessWidget {
  const LaunchPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'PROGRAM SUCCESSFULLY RUN',
          style: TextStyle(
            color: Colors.white,
            fontWeight: FontWeight.bold,
          ),
        ),
        backgroundColor: Colors.amber,
      ),
      body: Row(
        children: [
          Expanded(child: Container(color: Colors.red,)),
          Expanded(child: Container(color: Colors.green,)),
          Expanded(child: Container(color: Colors.yellow,)),
        ],
      ),
    );
  }
}
