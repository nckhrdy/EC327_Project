//
//  RazKey.cpp
//  
//
//  Created by Nick Hardy on 12/2/21.
//

#include "RazKey.hpp"
using namespace std;

bool checkLogin(string userLogin)
{
        if (userLogin == password)
        {
            cout<<"\t****welcome back****"<<endl;
            return true;
        }
        else
        {
            cout<<"\n\tWrong password"<<endl;
            return false;
        }
}

void checkChoice(char choiceInput)
{
    if (choiceInput == 'p')
    {
        cout<<"Read or Write? ";
        cin>>ReadOrWrite;
        if (ReadOrWrite == 'r')
            ReadPasswords();
        else if(ReadOrWrite == 'w')
            WritePassword();
        else
            cout<<"enter a valid input"<<endl;
    }
    else if(choiceInput == 'b')
    {
        cout<<"Read or Write? ";
        cin>>ReadOrWrite;
        if (ReadOrWrite == 'r')
            ReadBirthdays();
        else if(ReadOrWrite == 'w')
            WriteBirthday();
        else
            cout<<"enter a valid input"<<endl;
    }
    else if(choiceInput == 'r')
    {
        cout<<"Read or Write? ";
        cin>>ReadOrWrite;
        if (ReadOrWrite == 'r')
            ReadRecepies();
        else if(ReadOrWrite == 'w')
            WriteRecepie();
        else
            cout<<"enter a valid input"<<endl;
    }
    else
    {
        cout<<"enter a valid input"<<endl;
    }
}
void ReadPasswords()
{
    cout<<"READ PASS"<<endl;
    string line;
      ifstream myfile ("passwords.txt");
      if (myfile.is_open())
      {
        while ( getline (myfile,line) )
        {
          cout << line << '\n';
        }
        myfile.close();
      }

      else cout << "Unable to open file";
}
void WritePassword()
{
    cout<<"WRITE PASS"<<endl;
    ofstream myfile ("passwords.txt");
    if (myfile.is_open())
    {
        cout<<"\n\tNew Password: ";
        cin>>NewPassword;
        myfile << NewPassword;
        
        myfile.close();
    }
    else cout << "Unable to open file";
    
}
void ReadBirthdays()
{
    cout<<"READ BIRTDAYS"<<endl;
    string line;
      ifstream myfile ("birthdays.txt");
      if (myfile.is_open())
      {
        while ( getline (myfile,line) )
        {
          cout << line << '\n';
        }
        myfile.close();
      }

      else cout << "Unable to open file";
}
void WriteBirthday()
{
    cout<<"WRITE BIRTHDAY"<<endl;
    ofstream myfile ("birthdays.txt");
    if (myfile.is_open())
    {
        cout<<"\n\tNew Birthday: ";
        cin>>NewBirthday;
        myfile << NewBirthday;
        
        myfile.close();
    }
    else cout << "Unable to open file";
}
void ReadRecepies()
{
    cout<<"READ RECEPIE"<<endl;
    string line;
      ifstream myfile ("recepies.txt");
      if (myfile.is_open())
      {
        while ( getline (myfile,line) )
        {
          cout << line << '\n';
        }
        myfile.close();
      }

      else cout << "Unable to open file";
}
void WriteRecepie()
{
    cout<<"WRITE RECEPIE"<<endl;
    ofstream myfile ("recepies.txt");
    if (myfile.is_open())
    {
        cout<<"\n\tNew Recepie: ";
        cin>>NewRecepie;
        myfile << NewRecepie;
        
        myfile.close();
    }
    else cout << "Unable to open file";
}
int main()
{
    cout<<"\n\tEnter User Password: ";
    cin>>userLogin;
    
    while (!checkLogin(userLogin))
    {
        cout<<"\n\tEnter User Password: ";
        cin>>userLogin;
    }
    cout<<"\n\n\tSelect a folder\n\t  PASSWORDS\n\t  BIRTHDAYS\n\t  RECIPIES\n";
    cin>>choiceInput;
//    cout<<choiceInput<<endl;
    checkChoice(choiceInput);
    return 0;
}
