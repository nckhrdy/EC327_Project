//
//  RazKey.hpp
//  
//
//  Created by Nick Hardy on 12/2/21.
//

#ifndef RazKey_hpp
#define RazKey_hpp

#include <stdio.h>
#include <string>
#include <iostream>
#include <fstream>
using namespace std;

#endif /* RazKey_hpp */

string password = "rabbit";
string userLogin,NewPassword, NewBirthday, NewRecepie;
bool passwordCheck = false;
char choiceInput, ReadOrWrite;


bool checkLogin(string);
void checkChoice(char);
void newLogin(string);
void ReadPasswords();
void WritePassword();
void ReadBirthdays();
void WriteBirthday();
void ReadRecepies();
void WriteRecepie();



