# relief-mvi

A Kotlin library that implements the Model-View-Intent (MVI) design pattern. This library is built on top of the popular Orbit-MVI library and is meant to provide relief from the challenges that developers may face when implementing the MVI pattern.

## Features
- Provides a solid foundation for MVI architecture
- Built on top of the popular Orbit-MVI library, which ensures a consistent and stable base
- Easy to understand and implement in your project
- Provides a clear separation of concerns
- Allows for easy testing and maintenance

MVI is a design pattern that separates the logic of the application into three main components: the Model, the View, and the Intent. The Model represents the state of the application, the View is responsible for displaying the state, and the Intent is responsible for handling user interactions and updating the state. 

MVI has an advantage over MVVM in that it provides a clearer separation of concerns, as well as making it easier to test and maintain the code. It also makes it easier to handle asynchronous data and handle errors.

To use the library, simply add the following line to your app's `build.gradle` file:

```Groovy
implementation 'app.vahid.android:relief-mvi:1.0.0'
```

Check the sample project for a complete example of how to use the library in your project.
We welcome contributions to the library. If you find any bugs or have any feature requests, please open an issue. If you want to contribute code, please fork the repository and open a pull request.
