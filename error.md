Почему я не могу перейти в директорию?

```
"C:\Program Files\Java\jdk-12.0.1\bin\java.exe" "-javaagent:E:\Program Files\JetBrains\IntelliJ IDEA 2019.1.2\lib\idea_rt.jar=5799:E:\Program Files\JetBrains\IntelliJ IDEA 2019.1.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\max\Desktop\exams\Lashko\target\classes examLashko.ExamJavaMain
dir - выводит список файлов в текущей директории
cd «путь» - перейти в директорию, путь к которой задан первым аргументом
pwd - вывести полный путь до текущей директории
cat «имя_файла» - выводит содержимое текстового файла «имя_файла»
download «url» «имя_файла» - загружает файл
exit - выход
-> dir
.git
.idea
ExamJava.iml
pom.xml
README.md
src
target
Вывод прошёл успешно!
-> cd src
Переход прошёл успешно!
-> dir
main
Вывод прошёл успешно!
-> cd main
Не является директорией!
-> dir
main
Вывод прошёл успешно!
-> cd main
Не является директорией!
```