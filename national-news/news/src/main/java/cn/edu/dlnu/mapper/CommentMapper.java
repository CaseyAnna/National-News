package cn.edu.dlnu.mapper;

import cn.edu.dlnu.pojo.Comment;
import cn.edu.dlnu.pojo.CommentCustom;
import cn.edu.dlnu.pojo.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    int countByNewsId(Integer NewsId);

    List<Comment> selectByNewsId(Integer newsId);

    List<CommentCustom> selectHotCommentNews();

    List<Comment> selectByShareId(Integer shareId);
}