package board.board.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardDto {
	private int boardIdx;
	private String title;
	private String contents;
	private String hitCnt;
	private LocalDateTime createDt;
	//private Timestamp createDt; 

}
