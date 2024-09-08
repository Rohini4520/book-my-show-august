package com.acciojob.book_my_show_august.Repositories;

import com.acciojob.book_my_show_august.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
