package api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList" +
            "&api_key=bb7483ebafe87ffac43f7a2d17ec6a1e" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s")
    fun fetchPhotos(): Call<FlickrResponse>
}