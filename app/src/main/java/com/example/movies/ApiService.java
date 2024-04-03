package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("v1.4/movie?token=VJAHGEY-TAHMKYJ-GRS6BDQ-K6KBJM8&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=20")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("v1.4/movie/{id}?token=VJAHGEY-TAHMKYJ-GRS6BDQ-K6KBJM8")
    Single<TrailerResponse> loadTrailers(@Path("id") int id);

    @GET("v1.4/review?token=VJAHGEY-TAHMKYJ-GRS6BDQ-K6KBJM8")
    Single<ReviewResponse> loadReview(@Query("movieId") int movieId);
}
