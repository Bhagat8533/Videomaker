package com.aiii.sdk.android.oss.model;

public class ImagePersistRequest extends OSSRequest {
    public String mAction;
    public String mFromBucket;
    public String mFromObjectkey;
    public String mToBucketName;
    public String mToObjectKey;

    public ImagePersistRequest(String str, String str2, String str3, String str4, String str5) {
        this.mFromBucket = str;
        this.mFromObjectkey = str2;
        this.mToBucketName = str3;
        this.mToObjectKey = str4;
        this.mAction = str5;
    }
}
