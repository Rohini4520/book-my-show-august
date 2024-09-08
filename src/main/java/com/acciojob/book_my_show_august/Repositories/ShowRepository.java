package com.acciojob.book_my_show_august.Repositories;

import com.acciojob.book_my_show_august.Models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show, Integer> {
}
