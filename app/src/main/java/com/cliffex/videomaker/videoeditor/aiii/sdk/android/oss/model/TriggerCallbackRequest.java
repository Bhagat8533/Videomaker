package com.aiii.sdk.android.oss.model;

import java.util.Map;

public class TriggerCallbackRequest extends OSSRequest {
    private String mBucketName;
    private Map<String, String> mCallbackParam;
    private Map<String, String> mCallbackVars;
    private String mObjectKey;

    public TriggerCallbackRequest(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        setBucketName(str);
        setObjectKey(str2);
        setCallbackParam(map);
        setCallbackVars(map2);
    }

    public String getBucketName() {
        return this.mBucketName;
    }

    public Map<String, String> getCallbackParam() {
        return this.mCallbackParam;
    }

    public Map<String, String> getCallbackVars() {
        return this.mCallbackVars;
    }

    public String getObjectKey() {
        return this.mObjectKey;
    }

    public void setBucketName(String str) {
        this.mBucketName = str;
    }

    public void setCallbackParam(Map<String, String> map) {
        this.mCallbackParam = map;
    }

    public void setCallbackVars(Map<String, String> map) {
        this.mCallbackVars = map;
    }

    public void setObjectKey(String str) {
        this.mObjectKey = str;
    }
}
