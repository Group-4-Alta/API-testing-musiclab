package starter.MusicLab;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;
public class MentorAPI {
    public static String GET_ALL_MENTORS_PATH_1 = Constants.BASE_URL + "/mentors?page={page}&limit={limit}&name={name}";
    public static String GET_ALL_MENTORS_INVALID_PATH_1 = Constants.BASE_URL + "/mentors/page={page}/limit={limit}/name={name}";
    public static String GET_ALL_MENTORS_PATH_2 = Constants.BASE_URL + "/mentors?page={page}&limit={limit}&instrument={instrument}&genre={genre}";
    public static String GET_ALL_MENTORS_INVALID_PATH_2 = Constants.BASE_URL + "/page={page}&limit={limit}&instrument={instrument}&genre={genre}";
    public static String GET_ALL_MENTORS_PATH_3 = Constants.BASE_URL + "/mentors?rating={rating}&qualification={qualification}";
    public static String GET_EMPTY_PARAM = Constants.BASE_URL + "/mentors?page=&limit=&name=&instrument=&genre=&rating=&qualification=";
    public static String GET_TOP_MENTOR_PATH = Constants.BASE_URL + "/mentors/{path}";
    public static String GET_PROFILE_MENTOR_PATH = Constants.BASE_URL + "/mentors/{path}";
    public static String GET_PROFILE_MENTOR_BY_ID = Constants.BASE_URL + "/mentors/{id}";
    public static String PUT_EDIT_MENTOR = Constants.BASE_URL + "/mentors";
    public static String POST_MENTOR_CREDETIAL = Constants.BASE_URL + "/mentors/credetials";
    public static String DELETE_DEACTIVE_MENTOR = Constants.BASE_URL + "/mentors";

    @Step("Get all mentors with parameter page, limit, name")
    public void getAllMentorsA(int page, int limit, String name) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("page", page)
                .pathParam("limit", limit)
                .pathParam("name", name);
    }

    @Step("Get all mentors with parameter page, limit, instrument, genre")
    public void getAllMentorsB(int page, int limit, int instrument, int genre) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("page", page)
                .pathParam("limit", limit)
                .pathParam("instrument", instrument)
                .pathParam("genre", genre);
    }

    @Step("Get all mentors with parameter rating, qualification")
    public void getAllMentorsC(int rating, String qualification) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("rating", rating)
                .pathParam("qualification", qualification);
    }

    @Step("Get all mentors with empty parameter")
    public void getAllMentorsWithEmptyParam() {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR);
    }

    @Step("Get all mentor by rating")
    public void getAllMentorsByRating(String path) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("path", path);
    }

    @Step("Get profile mentor")
    public void getProfileMentor(String path) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("path", path);
    }

    @Step("Get mentor profile by id mentor")
    public void getMentorProfileByIdMentor(int id) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_TOKEN_MENTOR)
                .pathParam("id", id);
    }

    @Step("Put edit mentor profile")
    public void putEditMentorProfile() {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.ACCESS_MENTOR);
    }
}
