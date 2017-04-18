namespace com.moonlight.test;

struct Hello<T> extends Request<string> {
    T data;
    string name;
    int age;
    required Hero hero;
}