package codeclowns.planny.planny.service;

import codeclowns.planny.planny.data.dto.BoardDto;
import codeclowns.planny.planny.data.dto.WorkspacesDto;
import codeclowns.planny.planny.data.entity.BoardE;

import java.util.List;

public interface BoardService {
    public List<BoardE> getAllEnabledBoard(BoardDto boardDto) throws Exception;
    public BoardE saveBoard(BoardDto boardDto ) throws Exception;
}