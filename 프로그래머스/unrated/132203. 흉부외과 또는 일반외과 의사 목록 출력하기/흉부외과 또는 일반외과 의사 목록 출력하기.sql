SELECT dr_name, dr_id, mcdp_cd, LEFT(hire_ymd, 10) AS HIRE_YMD
FROM doctor
WHERE mcdp_cd = 'CS' OR mcdp_cd = 'GS'
ORDER BY HIRE_YMD DESC, dr_name ASC