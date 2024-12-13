package com.example.Simple.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Simple.Model.UserInfo;
@Repository
public interface UserRepo extends JpaRepository<UserInfo, Integer> {

}

