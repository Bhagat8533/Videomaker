package com.introvd.template.router.user.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

@Keep
public class LoginUserInfo {
    public static final int GENDER_FEMALE = 1;
    public static final int GENDER_MALE = 0;
    public static final int GENDER_SECRET = 2;
    public int accountFlag;
    @SerializedName("userVipInfoAndroid")
    public String androidVipInfo;
    public int applyFollowState;
    public String auid;
    public String avatarUrl;
    public String background;
    public String communityPermission;
    public String country;
    public String description;
    public String equipment;
    public int fans;
    public int followState;
    public int follows;
    public int gender;
    public int grade;
    public String gradeIconUrl;
    public String infoState;
    public int isAdmin;
    public boolean isExcellentCreator;
    public boolean isVerified;
    public int level;
    public int liveHostLevel;
    public String location;
    public Map<String, String> mSnsInfoMap;
    public String mSnsInfosStr;
    public String mStrSnsInfo;
    public String nickname;
    public long numberId;
    public int privacyFlag;
    public int publicVideoCount;
    public SnsInfo snsInfo = new SnsInfo();
    public String strSinaWeiboLinkApp;
    public String strSinaWeiboLinkWeb;
    public String token;
    public long tokenExpireTime;
    public long totalLikeCount;
    public int uniqueFlag;
    public long updatetime;
    public long validity;
    public String verifiedDesc;
    public String verifiedInfoJson;
    public String zone;

    public class SnsInfo {
        public String avatar;
        public long expiredtime;
        public String name;
        public String snsAccessToken;
        public String snsNickName;
        public int snsType;
        public String snsUID;
        public long updateTime;

        public SnsInfo() {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoginUserInfo{snsInfo=");
        sb.append(this.snsInfo);
        sb.append(", auid='");
        sb.append(this.auid);
        sb.append('\'');
        sb.append(", nickname='");
        sb.append(this.nickname);
        sb.append('\'');
        sb.append(", avatarUrl='");
        sb.append(this.avatarUrl);
        sb.append('\'');
        sb.append(", token='");
        sb.append(this.token);
        sb.append('\'');
        sb.append(", tokenExpireTime=");
        sb.append(this.tokenExpireTime);
        sb.append(", validity=");
        sb.append(this.validity);
        sb.append(", country='");
        sb.append(this.country);
        sb.append('\'');
        sb.append(", zone='");
        sb.append(this.zone);
        sb.append('\'');
        sb.append(", description='");
        sb.append(this.description);
        sb.append('\'');
        sb.append(", equipment='");
        sb.append(this.equipment);
        sb.append('\'');
        sb.append(", location='");
        sb.append(this.location);
        sb.append('\'');
        sb.append(", background='");
        sb.append(this.background);
        sb.append('\'');
        sb.append(", gender=");
        sb.append(this.gender);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", uniqueFlag=");
        sb.append(this.uniqueFlag);
        sb.append(", accountFlag=");
        sb.append(this.accountFlag);
        sb.append(", infoState='");
        sb.append(this.infoState);
        sb.append('\'');
        sb.append(", isAdmin=");
        sb.append(this.isAdmin);
        sb.append(", updatetime=");
        sb.append(this.updatetime);
        sb.append(", follows=");
        sb.append(this.follows);
        sb.append(", fans=");
        sb.append(this.fans);
        sb.append(", followState=");
        sb.append(this.followState);
        sb.append(", publicVideoCount=");
        sb.append(this.publicVideoCount);
        sb.append(", mStrSnsInfo='");
        sb.append(this.mStrSnsInfo);
        sb.append('\'');
        sb.append(", mSnsInfoMap=");
        sb.append(this.mSnsInfoMap);
        sb.append(", verifiedInfoJson='");
        sb.append(this.verifiedInfoJson);
        sb.append('\'');
        sb.append(", isExcellentCreator=");
        sb.append(this.isExcellentCreator);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", verifiedDesc='");
        sb.append(this.verifiedDesc);
        sb.append('\'');
        sb.append(", strSinaWeiboLinkApp='");
        sb.append(this.strSinaWeiboLinkApp);
        sb.append('\'');
        sb.append(", strSinaWeiboLinkWeb='");
        sb.append(this.strSinaWeiboLinkWeb);
        sb.append('\'');
        sb.append(", liveHostLevel=");
        sb.append(this.liveHostLevel);
        sb.append(", grade=");
        sb.append(this.grade);
        sb.append(", gradeIconUrl='");
        sb.append(this.gradeIconUrl);
        sb.append('\'');
        sb.append(", numberId=");
        sb.append(this.numberId);
        sb.append(", privacyFlag=");
        sb.append(this.privacyFlag);
        sb.append(", applyFollowState=");
        sb.append(this.applyFollowState);
        sb.append(", communityPermission='");
        sb.append(this.communityPermission);
        sb.append('\'');
        sb.append(", mSnsInfosStr='");
        sb.append(this.mSnsInfosStr);
        sb.append('\'');
        sb.append(", totalLikeCount=");
        sb.append(this.totalLikeCount);
        sb.append(", androidVipInfo='");
        sb.append(this.androidVipInfo);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
