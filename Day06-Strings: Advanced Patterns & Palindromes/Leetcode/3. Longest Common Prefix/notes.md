Start with the first string as the possible prefix.
Compare it against every other string.
If the current string doesn't start with the prefix, shorten it.
Continue until every string shares the prefix.

Time: O(n × m)
Space: O(1)

Key Takeaway:
For prefix problems, think about common characters from the beginning.
