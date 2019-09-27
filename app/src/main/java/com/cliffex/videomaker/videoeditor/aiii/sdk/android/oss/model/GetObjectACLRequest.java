package com.aiii.sdk.android.oss.model;

public class GetObjectACLRequest extends OSSRequest {
    private String bucketName;
    private String objectKey;

    public GetObjectACLRequest(String str, String str2) {
        setBucketName(str);
        setObjectKey(str2);
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public String getObjectKey() {
        return this.objectKey;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setObjectKey(String str) {
        this.objectKey = str;
    }
}
