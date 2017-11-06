package br.com.rest;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by andrei.vupt on 06/11/2017.
 */

public interface iRetrofitGitHub {

    @GET("/users/{usuario}")
    Call<Usuario> getUsuario(@Path("usuario")String usuario);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
