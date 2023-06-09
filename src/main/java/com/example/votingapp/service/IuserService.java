package com.example.votingapp.service;

import com.example.votingapp.Dto.LoginDTO;
import com.example.votingapp.Dto.RegisterDTO;
import com.example.votingapp.model.Candidate;
import com.example.votingapp.model.UserModel;

import java.util.List;

public interface IuserService {
    String RegisterNewUser(RegisterDTO registerDTO);
    String login(LoginDTO loginDTO);

    String Vote(String token, int CandidateID);

    String logoutUser(String token);

    UserModel fetchUserData(String token);
    List<Candidate> showAllCandiates();
}
