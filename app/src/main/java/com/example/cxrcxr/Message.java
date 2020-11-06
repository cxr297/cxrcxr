package com.example.cxrcxr;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Message  implements Parcelable {

    private String username;
    private String gender;
    private int age;

    public Message(String name,String gender,int age){
        this.username = name;
        this.gender = gender;
        this.age = age;
    }

    @NonNull
    @Override
    public String toString() {
        return "Message[username=" + username +"gender" + gender + "age" + age +"]";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public Message(Parcel in){
        username = in.readString();
        gender = in.readString();
        age = in.readInt();
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(gender);
        dest.writeInt(age);

    }

    public static Parcelable.Creator<Message> CREATOR = new Parcelable.Creator<Message>(){
        @Override
        public Message createFromParcel(Parcel source) {
            return new Message(source);
        }

        @Override
        public Message[] newArray(int size) {
            return new Message[size];
        }
    };

}
