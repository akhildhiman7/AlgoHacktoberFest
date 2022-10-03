#inlucde<bits/stdc++.h>
using namespace std;

struct TreeNode {
	int val;
	TreeNode *left;
	TreeNode *right;
	
	TreeNode() : val(0), left(NULL), right(NULL) {}
	TreeNode(int x) : val(x), left(NULL), right(NULL) {}
	TreeNode(int x, TreeNode* l, TreeNode *r) : val(x), left(l), right(r) {}
};

TreeNode* helper(int i, int j, vector<int> &arr) {
	if (j < i) {
		return NULL;
	}
	int mid = i + (j-i)/2;
	return new TreeNode(arr[mid], helper(i, mid-1, arr), helper(mid+1, j, arr));
}

TreeNode* solution(vector<int> &arr) {
	return helper(0, arr.size()-1, arr);
}

int main() {
	vector<int> arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	TreeNode *rootNode = solution(arr);
	return 0;
}
