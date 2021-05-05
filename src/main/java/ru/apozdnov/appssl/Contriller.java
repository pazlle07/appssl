package ru.apozdnov.appssl;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contriller {

    @GetMapping("/welcome")
    public String welcome() {
        return "ssl/welcome";
    }

    @PostMapping("/post")
    public String welcome2() {
        String s = "sdasdasd";

        return HttpStatus.OK.toString();
    }
}
