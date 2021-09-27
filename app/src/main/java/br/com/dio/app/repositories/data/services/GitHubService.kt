package br.com.dio.app.repositories.data.services

import br.com.dio.app.repositories.data.model.Owner
import br.com.dio.app.repositories.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET(value = "users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>
}

interface GitHubOwner {
    @GET(value = "users/{user}")
    suspend fun listRepositories(@Path("user") user: String): Owner
}
