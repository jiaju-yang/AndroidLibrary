package io.github.psychesworld.cleanarchitecture.data.net;

import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

public class ApiClient {
    private Retrofit retrofit;
    private String url = "";
    private OkHttpClient client;
    private Converter.Factory converterFactory;

    public ApiClient() {
    }

    public void start() {
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(converterFactory)
                .client(client)
                .build();
    }

    public <S> S create(Class<S> serviceType) {
        return retrofit.create(serviceType);
    }

    public void setBaseUrl(String url) {
        this.url = url;
    }

    public void setConverterFactory(Converter.Factory converterFactory) {
        this.converterFactory = converterFactory;
    }

    public void setOkHttpClient(OkHttpClient client) {
        this.client = client;
    }
}
