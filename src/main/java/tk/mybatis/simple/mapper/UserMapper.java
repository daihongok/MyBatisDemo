package tk.mybatis.simple.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

public interface UserMapper {
	
	/**
	 * 通过 id 查询用户
	 * 
	 * @param id
	 * @return
	 */
	SysUser selectById(Long id);

	/**
	 * 查询全部用户
	 * 
	 * @return
	 */
	List<SysUser> selectAll();

	List<SysRole> selectRolesByUserId(Long userId);

	/**
	 * 新增用户
	 * @param sysUser
	 * @return
	 */
	int insert(SysUser sysUser);

	/**
	 * 新增用户-自动生成主键
	 * @param sysUser
	 * @return
	 */
	int insert2(SysUser sysUser);

	/**
	 * 新增用户-使用selectKey方式
	 * @param sysUser
	 * @return
	 */
	int insert3(SysUser sysUser);

	int updateById(SysUser sysUser);

	/**
	 * 通过主键删除
	 *
	 * @param id
	 * @return
	 */
	int deleteById(Long id);

	int deleteById(SysUser sysUser);

	/**
	 * 根据用户 id 和 角色的 enabled 状态获取用户的角色
	 *
	 * @param userId
	 * @param enabled
	 * @return
	 */
	List<SysRole> selectRolesByUserIdAndRoleEnabled(@Param("userId") Long userId,@Param("enabled") Integer enabled);

	/**
	 * 根据用户和角色获取
	 * @param user
	 * @param role
	 * @return
	 */
	List<SysRole> selectRolesByUserIdAndRole(@Param("user") SysUser user,@Param("role") SysRole role);

	/**
	 * 根据动态条件查询用户信息
	 *
	 * @param sysUser
	 * @return
	 */
	List<SysUser> selectByUser(SysUser sysUser);
}
