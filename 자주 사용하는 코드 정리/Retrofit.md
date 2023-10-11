### RetrofitService
```kotlin
interface RetrofitService{
    @GET("users/{userId}")
    fun getUserInfo(@Path("userId") userId: String): Call<UserInfo>
}
```

### Retrofit Builder
```kotlin
object RetrofitBuilder{
    var api: RetrofitService
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(RetrofitService::class.java)
    }
}
```
