package com.liqwer;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface User32 extends StdCallLibrary {
    //加载系统User32 DLL文件，也可以是C++写的DLL文件
    User32 INSTANCE = (User32) Native.loadLibrary("User32", User32.class);

    int SendMessageA(int hwnd, int msg, int wparam, int lparam);

    int FindWindowA(String arg0, String arg1);

    void BlockInput(boolean isBlock);

    int MessageBoxA(int hWnd, String lpText, int lpCaption, int uType);
}