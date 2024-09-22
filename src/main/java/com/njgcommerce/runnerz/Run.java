package com.njgcommerce.runnerz;

import java.time.LocalDateTime;

public record Run(
    Integer id,
    String title,
    LocalDateTime startedOn,
    LocalDateTime completedOn,
    Integer distance,
    Location location
){}
