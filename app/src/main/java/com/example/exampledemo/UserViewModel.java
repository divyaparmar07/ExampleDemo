package com.example.exampledemo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class UserViewModel extends AndroidViewModel {
    private UserRepository userRepository;
    private LiveData<List<User>> allUsers;
    private MutableLiveData<Boolean> navigateToAddUser = new MutableLiveData<>();
    private UserListAdapter userListAdapter;


    public UserViewModel(@NonNull Application application) {
        super(application);
        userRepository = new UserRepository(application);
        allUsers = userRepository.getAllUsers();
        userListAdapter = new UserListAdapter();
    }

    public LiveData<List<User>> getAllUsers() {
        return allUsers;
    }

    public void insertUser(User user) {
        userRepository.insertUser(user);
    }

    public LiveData<Boolean> getNavigateToAddUser() {
        return navigateToAddUser;
    }

    public void onAddUserClicked() {
        navigateToAddUser.setValue(true);
    }

    public void onAddUserNavigated() {
        navigateToAddUser.setValue(false);
    }
}