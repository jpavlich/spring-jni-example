#include "JNIWrapper.h"
#include <iostream>

JNIEXPORT jint JNICALL Java_com_example_springjni_JNIWrapper_sum(JNIEnv *env, jobject thisObj, jint num1, jint num2)
{
    std::cout << "sum: " << num1 << "  " << num2 << std::endl;
    return num1 + num2;
}