class Solution{   
public:
    string crossPattern(string s){
        // code here 
        string ans="";
       int l=s.length();
       for(int i=0;i<l;i++)
       {
           for(int j=0;j<l;j++)
           {
               if(i==j)
               ans+=s[i];
               else if(i+j==l-1)
               ans+=s[j];
               else
               ans+=" ";
           }
       }
       return ans;
    }
};
 
