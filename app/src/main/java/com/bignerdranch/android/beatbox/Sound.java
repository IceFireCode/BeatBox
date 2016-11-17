package com.bignerdranch.android.beatbox;

/**
 * Created by paulvancappelle on 15-11-16.
 */

public class Sound {

    String mSoundName;
    String mAssetPath;
    private Integer mSoundId;


    public Sound(String assetPath) {
        this.mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String name = components[components.length - 1];
        mSoundName = name.replace(".wav", "");
    }


    public String getSoundName() {
        return mSoundName;
    }


    public String getAssetPath() {
        return mAssetPath;
    }


    public Integer getSoundId() {
        return mSoundId;
    }


    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
