#include<stdio.h>
#include<stdlib.h>
struct node{
    struct node* left;
    struct node* right;
    int data;
};


struct node * createNode(int data){
    struct node *n;
    n=(struct node *)malloc(sizeof(struct node));
    n->left=NULL;
    n->right=NULL;
    n->data=data;
    return n;
}

void preorder(struct node *root){
    if(root==NULL){
        return;
    }

    printf("%d",root->data);
    preorder(root->left);
    preorder(root->right);
}

void postorder(struct node * root){
    if(root==NULL){
        return;
    }
    postorder(root->left);
    postorder(root->right);
    printf("%d",root->data);
}

void inorder(struct node * root){
    if(root==NULL){
        return;
    }
    inorder(root->left);
    printf("%d",root->data);
    inorder(root->right);
}

int main(){

    struct node * p=createNode(7);
    struct node * p1=createNode(2);
    struct node * p2=createNode(1);
    struct node * p3=createNode(0);
    struct node * p4=createNode(4);

    p->left=p1;
    p->right=p2;
    p1->left=p3;
    p1->right=p4;


    preorder(p);
    printf("\n");
    postorder(p);
    printf("\n");
    inorder(p);
    inorder(p);
    inorder(p);

    return 0;

}