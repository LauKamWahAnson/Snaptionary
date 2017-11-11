package tabian.com.instagramclone.models;

/**
 * Created by cheungwilson on 11/11/2017.
 */

public class UserAccountSettings {
    private String description;
    private String dispaly_name;
    private long followers;
    private long following;
    private long posts;
    private String profile_photo;
    private String username;
    private String website;

    public UserAccountSettings(String description, String dispaly_name, long followers, long following, long posts, String profile_photo, String username, String website) {
        this.description = description;
        this.dispaly_name = dispaly_name;
        this.followers = followers;
        this.following = following;
        this.posts = posts;
        this.profile_photo = profile_photo;
        this.username = username;
        this.website = website;
    }

    public UserAccountSettings() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDispaly_name() {
        return dispaly_name;
    }

    public void setDispaly_name(String dispaly_name) {
        this.dispaly_name = dispaly_name;
    }

    public long getFollowers() {
        return followers;
    }

    public void setFollowers(long followers) {
        this.followers = followers;
    }

    public long getFollowing() {
        return following;
    }

    public void setFollowing(long following) {
        this.following = following;
    }

    public long getPosts() {
        return posts;
    }

    public void setPosts(long posts) {
        this.posts = posts;
    }

    public String getProfile_photo() {
        return profile_photo;
    }

    public void setProfile_photo(String profile_photo) {
        this.profile_photo = profile_photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "UserAccountSettings{" +
                "description='" + description + '\'' +
                ", dispaly_name='" + dispaly_name + '\'' +
                ", followers=" + followers +
                ", following=" + following +
                ", posts=" + posts +
                ", profile_photo='" + profile_photo + '\'' +
                ", username='" + username + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
