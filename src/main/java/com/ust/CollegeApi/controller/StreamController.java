package com.ust.CollegeApi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ust.CollegeApi.Exception.ResourceNotFoundException;
import com.ust.CollegeApi.entity.Stream;
import com.ust.CollegeApi.repository.StreamRepository;




@RestController
@RequestMapping("/streams")
public class StreamController {
    @Autowired
    private StreamRepository streamRepository;

    @GetMapping
    public List<Stream> getAllStreams() {
        return streamRepository.findAll();
    }

    @GetMapping("/{id}")
    public Stream getStreamById(@PathVariable Long id) {
        return streamRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Stream not found"));
    }

    @PostMapping
    public Stream createStream(@RequestBody Stream stream) {
        return streamRepository.save(stream);
    }

    @PutMapping("/{id}")
    public Stream updateStream(@PathVariable Long id, @RequestBody Stream streamDetails) {
        Stream stream = streamRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Stream not found"));
        stream.setName(streamDetails.getName());
        return streamRepository.save(stream);
    }

    @DeleteMapping("/{id}")
    public void deleteStream(@PathVariable Long id) {
        Stream stream = streamRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Stream not found"));
        streamRepository.delete(stream);
    }
}
