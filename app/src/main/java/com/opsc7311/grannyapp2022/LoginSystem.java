package com.opsc7311.grannyapp2022;

public class LoginSystem {
    private String[][] Details = {
            {"granny","cats"},{"granpa","dogs"},{"grandchild","fish"}
    };
    private static int UserLogin = 0;

    public boolean Login(String strUsername, String strPassword)
    {
        for (int x = 0; x < Details.length; x++)
        {
            if (Details[x][0].equals(strUsername.toLowerCase()) ||
                Details[x][0].equals(strPassword.toLowerCase()))
            {
                UserLogin = x;
                return true;
            }
        }

        return false;
    }

    public String GetLoginUser(){ return Details[UserLogin][0];}
}
