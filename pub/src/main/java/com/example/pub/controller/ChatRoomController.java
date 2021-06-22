package com.example.pub.controller;

import com.example.pub.domain.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
@Controller
@RequestMapping("/chat")
public class ChatRoomController {

//    private final com.spring.wschat.repo.ChatRoomRepository chatRoomRepository;

    // 채팅 리스트 화면
    @GetMapping("/room")
    public String rooms(Model model) {
        System.out.println("Asesaeaewa");
        return "/chat/room";
    }
    // 모든 채팅방 목록 반환
    @GetMapping("/rooms")
    @ResponseBody
    public List<ChatRoom> room() {
        List<ChatRoom> list = new ArrayList<>();
          ChatRoom c = new ChatRoom();
          c.setName("김한결");
          c.setRoomId("1");
          list.add(c);
         c.setName("김한결2");
         c.setRoomId("2");
            list.add(c);

        return list;
    }
    // 채팅방 생성
    @PostMapping("/room")
    @ResponseBody
    public ChatRoom createRoom(@RequestParam String name) {
        ChatRoom c = new ChatRoom();
        c.setName("김한결");
        c.setRoomId("1");
        return c;
    }
    // 채팅방 입장 화면
    @GetMapping("/room/enter/{roomId}")
    public String roomDetail(Model model, @PathVariable String roomId) {
        model.addAttribute("roomId", roomId);
        return "/chat/roomdetail";
    }
    // 특정 채팅방 조회
    @GetMapping("/room/{roomId}")
    @ResponseBody
    public ChatRoom roomInfo(@PathVariable String roomId) {
             ChatRoom c = new ChatRoom();
             c.setName("김한결");
             c.setRoomId("1");
        return c;
    }
}