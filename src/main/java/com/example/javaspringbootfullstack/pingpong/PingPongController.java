package com.example.javaspringbootfullstack.pingpong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ping")
public class PingPongController {

    @GetMapping(produces = "text/html")  // tell Spring to return HTML
    public String pingPong(){
        return "<h1 style='color:red; font-size:40px;'>" +
                "The wonderful, the only queen, the one, the perfect, the gorgeous, the radiant, the divine, the graceful, the flawless, the enchanting, the majestic, the elegant, the breathtaking, the angelic, the dazzling, the supreme, the unforgettable, the unmatched, the rare jewel, the true goddess. DHAY " +
                " ❤ I love u dhauooooo ❤ </h1>";
    }
}
