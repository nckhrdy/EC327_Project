//
//  RazKey.hpp
//  
//
//  Created by Nick Hardy on 12/2/21.
//
//  Update by Kaede Kawata on 12/6/21.

#ifndef RazKey_hpp
#define RazKey_hpp

#include <stdio.h>
#include <string>
#include <iostream>
#include <fstream>
using namespace std;

class RazKey{
private:
  string password;

public:
  bool checkLogin(string);
  bool checkChoice(char);
  // void newLogin(string);
  // string ReadPasswords();
  // void WritePassword(string);
  // string ReadBirthdays();
  // void WriteBirthday(string);
  // string ReadRecepies();
  // void WriteRecepie(string);
  string Read(istream&);
  void Write(istream&);

}
#endif /* RazKey_hpp */

