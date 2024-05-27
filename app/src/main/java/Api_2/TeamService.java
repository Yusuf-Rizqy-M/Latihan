package Api_2;


import Api_2.TeamResponse2;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TeamService {
    @GET("search_all_teams.php?s=Soccer&c=Spain")
    Call<TeamResponse2> getTeams();
}