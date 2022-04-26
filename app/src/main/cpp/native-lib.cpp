#include <jni.h>
#include <string>

#ifdef __cplusplus
extern "C"
{
#endif

#include <libavcodec/avcodec.h>

    JNIEXPORT jstring JNICALL
Java_com_xyd_ffmpegtest_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

JNIEXPORT jstring JNICALL
Java_com_xyd_ffmpegtest_MainActivity_getFFmpegConfiguration(
        JNIEnv* env,
        jobject /* this */) {
    return env->NewStringUTF(avcodec_configuration());
}

#ifdef __cplusplus
}
#endif