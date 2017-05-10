# Android-ComparisonKotlinVSJava
banyak artikel yang membahas ke unggulan dari kotlin tanpa ada dokumentasi kebenarannya. disini kita akan membuat project sederhana yang memiliki beberapa komponen seperti recycleview,cardview,picasso, sehingga akan menjadi seperti gambar dibawah ini

### Perbandingan penulisan code

Java Class
```
public class User {
    String title;
    String imgData;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgData() {
        return imgData;
    }

    public void setImgData(String imgData) {
        this.imgData = imgData;
    }
}
```

Kotlin Class
```
class User(var name: String,var imageData: String) {

}
```

### Perbandingan performance RAM and Processor Kotlin dan Java
Java
![alt text](https://aeroyid.files.wordpress.com/2017/05/22.png)

Kotlin 
![alt text](https://aeroyid.files.wordpress.com/2017/05/33.png)

